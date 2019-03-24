<template>
    <sidebar-menu :menu="menu" :collapsed="true" @itemClick="onItemClick"/>
</template>

<script>
    import { mapState, mapActions } from 'vuex'
    import {SidebarMenu} from 'vue-sidebar-menu'

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
                'getAllCategories'
            ]),
            onItemClick(event, item) {
                console.log(item)

            }
        },
        mounted() {
            this.getAllCategories();
        }
    }
</script>

<style scoped>

</style>