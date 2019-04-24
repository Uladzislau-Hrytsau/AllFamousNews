// import Vue from 'vue'
import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'
import VueMaterial from 'vue-material'
import 'vue-material/dist/vue-material.min.css'

Vue.use(VueMaterial);
Vue.use(Vuex);

axios.defaults.baseURL = 'http://localhost:8080/';

export const store = new Vuex.Store({

    state: {
        size: 10,
        page: localStorage.getItem('page') || 1,
        count: localStorage.getItem('count') || null,
        menu: [],
        articles: [],
        currentCategory: localStorage.getItem('currentCategory') || 1,
        paginationItem: localStorage.getItem('paginationItem') || 1,
        title: ''
    },

    getters: {},

    mutations: {
        setMenu(state, menu) {
            state.menu = menu;
        },
        destroyMenu(state) {
            state.menu = null;
        },
        setArticles(state, articles) {
            state.articles = articles;
        },
        destroyArticles(state) {
            state.articles = null;
        },
        setCount(state, count) {
            state.count = count;
        },
        destroyCount(state) {
            state.count = null;
        },
        setCurrentCategory(state, currentCategory) {
            state.currentCategory = currentCategory;
        },
        destroyCurrentCategory(state) {
            state.currentCategory = null;
        },
        setPaginationItem(state, paginationItem) {
            state.paginationItem = paginationItem;
        },
        destroyPaginationItem(state) {
            state.paginationItem = null;
        },
        setCurrentPage(state, page) {
            state.page = page;
        },
        destroyCurrentPage(state) {
            state.page = null;
        },
        setTitle(state, title) {
            state.title = title;
        },
        destroyTitle(state) {
            state.title = null;
        }
    },

    actions: {
        getAllCategories(context) {
            return new Promise((resolve, reject) => {
                axios
                    .get('/categories')
                    .then(response => {
                        context.commit('setMenu', response.data);
                        resolve(response)
                    })
                    .catch(error => {
                        console.log(error);
                        reject(error)
                    })
            })
        },

            getArticlesAndCount(context) {
            return new Promise((resolve, reject) => {
                axios
                    .get('/articles', {
                        params: {
                            'size': this.state.size,
                            'page': this.state.page
                        }
                    })
                    .then(response => {
                        let count = response.data.count;
                        let size = this.state.size;
                        let paginationItem = 1;
                        if (count <= 0) {
                            count = 1;
                        }
                        if (size <= 0) {
                            size = 1;
                        }
                        if (count > 0 && size > 0) {
                            if (count % size === 0) {
                                paginationItem = count / size;
                            } else {
                                paginationItem = Math.floor((count / size)) + 1;
                            }
                        }
                        context.commit('setPaginationItem', paginationItem);
                        localStorage.setItem('paginationItem', paginationItem);
                        context.commit('setArticles', response.data.data);
                        context.commit('setCount', response.data.count);
                        localStorage.setItem('count', response.data.count);
                        resolve(response)
                    })
                    .catch(error => {
                        console.log(error);
                        reject(error)
                    })
            })
        },

        getArticlesAndCountByCategoryId(context) {
            return new Promise((resolve, reject) => {
                axios
                    .get('/articles', {
                        params: {
                            'size': this.state.size,
                            'page': this.state.page,
                            'categoryId': this.state.currentCategory
                        }
                    })
                    .then(response => {
                        let count = response.data.count;
                        let size = this.state.size;
                        let paginationItem = 1;
                        if (count <= 0) {
                            count = 1;
                        }
                        if (size <= 0) {
                            size = 1;
                        }
                        if (count > 0 && size > 0) {
                            if (count % size === 0) {
                                paginationItem = count / size;
                            } else {
                                paginationItem = Math.floor((count / size)) + 1;
                            }
                        }
                        context.commit('setPaginationItem', paginationItem);
                        localStorage.setItem('paginationItem', paginationItem);
                        context.commit('setArticles', response.data.data);
                        context.commit('setCount', response.data.count);
                        localStorage.setItem('count', response.data.count);
                        resolve(response)
                    })
                    .catch(error => {
                        console.log(error);
                        reject(error)
                    })
            })
        },

        getArticlesAndCountByTitle(context) {
            return new Promise((resolve, reject) => {
                axios
                    .get('/articles', {
                        params: {
                            'size': this.state.size,
                            'page': this.state.page,
                            'articleName': this.state.title,
                        }
                    })
                    .then(response => {
                        let count = response.data.count;
                        let size = this.state.size;
                        let paginationItem = 1;
                        if (count <= 0) {
                            count = 1;
                        }
                        if (size <= 0) {
                            size = 1;
                        }
                        if (count > 0 && size > 0) {
                            if (count % size === 0) {
                                paginationItem = count / size;
                            } else {
                                paginationItem = Math.floor((count / size)) + 1;
                            }
                        }
                        context.commit('setPaginationItem', paginationItem);
                        localStorage.setItem('paginationItem', paginationItem);
                        context.commit('setArticles', response.data.data);
                        context.commit('setCount', response.data.count);
                        localStorage.setItem('count', response.data.count);
                        resolve(response)
                    })
                    .catch(error => {
                        console.log(error);
                        reject(error)
                    })
            })
        }

    },
});
