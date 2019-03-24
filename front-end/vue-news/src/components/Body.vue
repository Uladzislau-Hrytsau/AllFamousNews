<template>
    <div id="Body">
        <Tree></Tree>
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <Article></Article>
                    <Pagination ></Pagination>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import {mapActions, mapState} from 'vuex';
    import Tree from './body/Tree';
    import Article from './body/Article';
    import Pagination from './body/Pagination';

    export default {
        name: "Body",
        components: {
            Tree,
            Article,
            Pagination
        },
        computed: {
            ...mapState([
                'currentCategory',
                'title'
            ])
        },
        methods: {
            ...mapActions([
                'getArticlesAndCount',
                'getArticlesAndCountByCategoryId',
                'getArticlesAndCountByTitle'
            ]),
        },
        mounted() {
            if (this.currentCategory) {
                this.getArticlesAndCountByCategoryId();
            } else if (this.title) {
                this.getArticlesAndCountByTitle();
            } else {
                this.getArticlesAndCount();
            }
        }
    }
</script>

<style scoped>
    #Body {
        height:100%;
    }
</style>