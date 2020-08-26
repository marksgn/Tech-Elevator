<template>
    <div>
        <bestseller-list></bestseller-list>
        <new-releases-list></new-releases-list>
    </div>
</template>

<script>
import BestsellerList from '@/components/BestsellerList.vue';
import NewReleasesList from '@/components/NewReleasesList.vue';

export default {
    components: {
        BestsellerList,
        NewReleasesList
    }
}
</script>

<style>

</style>

