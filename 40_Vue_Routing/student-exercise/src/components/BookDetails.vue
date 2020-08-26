<template>
  <book-card v-bind:key="book.isbn"> </book-card>
</template>

<script>
import BookCard from '@/components/BookCard.vue';

export default {
    name: 'book-details',
    components: {
        BookCard
    }
}
</script>

<style>

</style>