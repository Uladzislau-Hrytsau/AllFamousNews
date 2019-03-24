<template>
    <sidebar-menu :menu="menu" :collapsed="true" @itemClick="onItemClick"/>
</template>

<script>
    import { mapState, mapActions, mapMutations } from 'vuex'
    import { SidebarMenu } from 'vue-sidebar-menu'

    export default {
        name: "Tree",
        components: {
            SidebarMenu
        },
        data() {
            return {

            }
        },

        computed: {
            ...mapState([
                'menu'
            ])
        },
        methods: {
            ...mapActions([
                'getAllCategories',
                'getArticlesAndCountByCategoryId'
            ]),
            ...mapMutations([
                'setCurrentCategory',
                'destroyCurrentPage',
                'setCurrentPage',
                'destroyTitle',
                'setMenu'
            ]),
            onItemClick(event, item) {
                this.destroyTitle();
                this.setCurrentPage(1);
                this.setCurrentCategory(item.id);
                this.getArticlesAndCountByCategoryId();
            }
        },
        mounted() {
            this.getAllCategories();
        }
    }
</script>

<style scoped>

</style>