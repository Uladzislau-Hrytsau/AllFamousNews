// import Vue from 'vue'
import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'
import VueMaterial from 'vue-material'
import 'vue-material/dist/vue-material.min.css'

Vue.use(VueMaterial);
Vue.use(Vuex);

axios.defaults.baseURL = 'http://localhost:8080';

export const store = new Vuex.Store({

    state: {
        menu: []
    },

    getters: {},

    mutations: {
        setMenu(state, menu) {
            state.menu = menu;
        },
        destroyMenu(state) {
            state.menu = null;
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
        }

    },
});
