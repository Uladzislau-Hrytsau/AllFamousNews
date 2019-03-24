<template>
    <mdb-navbar class="justify-content-between">
        <div class="container">
            <mdb-navbar-brand href="#">
                All Famous News
            </mdb-navbar-brand>
            <form class="form-inline">
                <i class="fas fa-search" aria-hidden="true"></i>
                <input class="form-control form-control-sm  ml-3 mr-1" type="text" placeholder="Search"
                       aria-label="Search">
                <mdb-btn outline="cyan" size="sm" class="my-0" type="submit">Search</mdb-btn>
            </form>
        </div>
    </mdb-navbar>
</template>

<script>
    import {mdbBtn, mdbNavbar, mdbNavbarBrand} from 'mdbvue';

    export default {
        name: "header",
        components: {
            mdbNavbar,
            mdbBtn,
            mdbNavbarBrand,
        }
    }
</script>

<style scoped>

</style>