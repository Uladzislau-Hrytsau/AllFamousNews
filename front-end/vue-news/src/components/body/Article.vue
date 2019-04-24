<template>
    <div>
        <mdb-container>
            <h2 class="h1-responsive font-weight-bold text-center my-5">Articles</h2>

            <div v-for="article in articles">
                <div>
                    <mdb-row>
                        <mdb-col lg="7">
                            <a class="indigo-text">
                                <h6 class="font-weight-bold mb-3">
                                    <mdb-icon icon="suitcase" class="pr-2"/>
                                    Food
                                </h6>
                            </a>
                            <h3 class="font-weight-bold mb-3 p-0">
                                <strong>{{article.articleName}}</strong>
                            </h3>
                            <p>{{article.articleDescription}}</p>
                            <p>by
                                <a>
                                    <strong>{{article.author}}</strong>
                                </a>, {{article.date}}</p>
                            <mdb-btn color="indigo" size="md" class="waves-light" v-on:click="readMore(article)">
                                Read more
                            </mdb-btn>
                        </mdb-col>
                        <mdb-col lg="5">
                            <mdb-view class="rounded z-depth-2 mb-lg-0 mb-4" hover>
                                <img class="img-fluid" v-bind:src="'http://localhost:8080/images/' + article.articleEncodeImg"
                                     alt="Sample image"/>
                                <a>
                                    <mdb-mask overlay="white-slight" waves/>
                                </a>
                            </mdb-view>
                        </mdb-col>
                    </mdb-row>
                </div>
                <hr class="my-5"/>
            </div>

        </mdb-container>
        <div>
            <mdb-modal size="lg" position="top" v-if="showModal11" @close="showModal11 = false">
                <mdb-modal-header>
                    <mdb-modal-title>
                        <h3>{{article.articleName}}</h3>
                    </mdb-modal-title>
                </mdb-modal-header>
                <mdb-modal-body>
                    <mdb-view class="rounded z-depth-2 mb-lg-0 mb-4" hover>
                        <img class="img-fluid" v-bind:src="'http://localhost:8080/images/' + article.articleEncodeImg"
                             alt="Sample image"/>
                        <a>
                            <mdb-mask overlay="white-slight" waves/>
                        </a>
                    </mdb-view>
                    <hr class="my-2"/>
                    by <strong>{{article.author}}</strong>, {{article.date}}
                    <hr class="my-2"/>
                    <h5>Description</h5>
                    {{article.articleDescription}}
                    <hr class="my-2"/>
                    <h5>Content</h5>
                    {{article.articleContent}}
                </mdb-modal-body>
                <mdb-modal-footer>
                    <mdb-btn color="indigo" @click.native="showModal11 = false">Close</mdb-btn>
                </mdb-modal-footer>
            </mdb-modal>
        </div>
    </div>
</template>

<script>
    import {mapMutations, mapState} from 'vuex';
    import {
        mdbBtn,
        mdbCol,
        mdbContainer,
        mdbIcon,
        mdbMask,
        mdbModal,
        mdbModalBody,
        mdbModalFooter,
        mdbModalHeader,
        mdbModalTitle,
        mdbRow,
        mdbView
    } from 'mdbvue';

    export default {
        name: "Article",
        components: {
            mdbContainer,
            mdbRow,
            mdbCol,
            mdbMask,
            mdbIcon,
            mdbView,
            mdbBtn,
            mdbModal,
            mdbModalHeader,
            mdbModalBody,
            mdbModalFooter,
            mdbModalTitle
        },
        data() {
            return {
                showModal11: false,
                article: []
            };
        },
        computed: {
            ...mapState([
                'articles'
            ])
        },
        methods: {
            ...mapMutations([]),
            readMore(article) {
                this.article = article;
                this.showModal11 = true;

            }
        }
    }
</script>

<style scoped>

</style>