<script setup>
import List from '../components/List.vue';



</script>

<template>
  <main>
    <List :array="[{
            id: 1,
            data: 'Max',
            },
            {
            id: 2,
            data: 'Kes',
            },
            {
            id: 3,
            data: 'Sel',
            }]"></List>
  </main>
</template>
