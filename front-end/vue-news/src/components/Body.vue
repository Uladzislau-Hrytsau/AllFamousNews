<template>
    <div>
        <Tree></Tree>
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <Article class="mb-5"></Article>
                    <Pagination></Pagination>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import Tree from './body/Tree';
    import Article from './body/Article';
    import Pagination from './body/Pagination';

    export default {
        name: "Body",
        components: {
            Tree,
            Article,
            Pagination
        }
    }
</script>

<style scoped>

</style>