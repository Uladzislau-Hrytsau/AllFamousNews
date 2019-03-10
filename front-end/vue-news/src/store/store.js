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
        folders: [],
    },

    getters: {},

    mutations: {
        getFolders(state, folders) {
            state.folders = folders
        },
    },

    actions: {

        displayStructure(context) {
            return new Promise(((resolve, reject) => {
                axios
                    .get('news')
                    .then(response => {
                        context.commit('getFolders', response.data)
                        console.log(response)
                        resolve(response)
                    })
                    .catch(error => {
                        console.log(error)
                        reject(error)
                    })
            }))
        }

    },
});
