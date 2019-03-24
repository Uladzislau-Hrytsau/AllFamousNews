<template>
    <div id="app">
        <Header></Header>
        <main class="container-fluid">
            <Body></Body>
        </main>
        <Footer></Footer>
    </div>
</template>

<script>
    import 'bootstrap-css-only/css/bootstrap.min.css';
    import 'mdbvue/build/css/mdb.css';
    import Header from './components/Header';
    import Body from './components/Body';
    import Footer from './components/Footer';

    export default {
        name: 'app',
        components: {
            Footer,
            Header,
            Body
        },
    }
</script>

<style>

</style>
