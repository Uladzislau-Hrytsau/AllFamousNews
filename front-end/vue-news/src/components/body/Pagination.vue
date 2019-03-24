<template>
    <div class="content-center offset-4">
        <mdb-pagination circle color="blue">
            <mdb-page-item disabled>First</mdb-page-item>
            <mdb-page-nav prev disabled></mdb-page-nav>
            <mdb-page-item active>1</mdb-page-item>
            <mdb-page-item>2</mdb-page-item>
            <mdb-page-item>3</mdb-page-item>
            <mdb-page-item>4</mdb-page-item>
            <mdb-page-item>5</mdb-page-item>
            <mdb-page-nav next></mdb-page-nav>
            <mdb-page-item>Last</mdb-page-item>
        </mdb-pagination>
    </div>
</template>

<script>
    import {mdbPageItem, mdbPageNav, mdbPagination} from 'mdbvue';

    export default {
        name: "Pagination",
        components: {
            mdbPagination,
            mdbPageItem,
            mdbPageNav
        }
    }
</script>

<style scoped>

</style>