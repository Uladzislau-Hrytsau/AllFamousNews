<template>
    <mdb-navbar class="justify-content-between">
        <div class="container">
            <mdb-navbar-brand href="#">
                All Famous News
            </mdb-navbar-brand>
            <form class="form-inline">
                <i class="fas fa-search" aria-hidden="true"></i>
                <div class="active-purple-3 active-purple-4 ">
                    <input class="form-control form-control-sm  ml-3 mr-1 " id="inputSearch" type="text"
                           placeholder="Search"
                           aria-label="Search" v-model="title">
                </div>
                <mdb-btn outline="indigo" size="sm" class="my-0" type="submit" v-on:click="searchByTitle">
                    Search
                </mdb-btn>
            </form>
        </div>
    </mdb-navbar>
</template>

<script>
    import {mapActions, mapMutations} from 'vuex';
    import {mdbBtn, mdbNavbar, mdbNavbarBrand} from 'mdbvue';

    export default {
        name: "header",
        data() {
            return {
                title: '',
            };
        },
        components: {
            mdbNavbar,
            mdbBtn,
            mdbNavbarBrand,
        },
        methods: {
            ...mapMutations([
                'setTitle',
                'destroyCurrentCategory'
            ]),
            ...mapActions([
                'getArticlesAndCountByTitle'
            ]),
            searchByTitle() {
                if (this.title !== null && !this.title.isEmpty) {
                    this.destroyCurrentCategory();
                    this.setTitle(this.title);
                    this.getArticlesAndCountByTitle();
                    document.getElementById('inputSearch').value = ''
                }
            }
        }
    }
</script>

<style scoped>
    .active-purple-4 input[type=text]:focus:not([readonly]) {
        border: 1px solid #3f51b5;
        box-shadow: 0 0 0 1px #3f51b5;
    }
    .active-purple-3 input[type=text] {
        border: 1px solid #3f51b5;
        box-shadow: 0 0 0 1px #3f51b5;
    }
</style>