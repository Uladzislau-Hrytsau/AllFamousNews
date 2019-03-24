<template>
    <div>
        <mdb-footer color="blue" class="font-small pt-4 mt-4">
            <mdb-container class="text-left">
                <mdb-row>
                    <mdb-col sm="6">
                        <h5 class="title">Footer Content</h5>
                        <p>Here you can use rows and columns here to organize your footer content.</p>
                    </mdb-col>
                    <mdb-col sm="6">
                        <h5 class="title">Links</h5>
                        <ul>
                            <li class="list-unstyled"><a href="#!">Link 1</a></li>
                            <li class="list-unstyled"><a href="#!">Link 2</a></li>
                            <li class="list-unstyled"><a href="#!">Link 3</a></li>
                            <li class="list-unstyled"><a href="#!">Link 4</a></li>
                        </ul>
                    </mdb-col>
                </mdb-row>
            </mdb-container>
            <div class="footer-copyright text-center py-3">
                <mdb-container fluid>
                    &copy; 2019 Copyright: AllFamousNews.com
                </mdb-container>
            </div>
        </mdb-footer>
    </div>
</template>

<script>
    import {
        mdbCol,
        mdbContainer,
        mdbFooter,
        mdbRow
    } from 'mdbvue';

    export default {
        name: "footer",
        components: {
            mdbFooter,
            mdbContainer,
            mdbRow,
            mdbCol
        }
    }
</script>

<style scoped>

</style>