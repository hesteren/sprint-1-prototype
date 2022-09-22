<script setup>
import List from '../components/AccountsList.vue';



</script>

<template>
  <main>
    <List :array="[{
            name: 'Max',
            nfts: ['1']
            }
]"></List>
  </main>
</template>
