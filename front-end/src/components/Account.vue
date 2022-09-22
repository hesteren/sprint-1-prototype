<template>
  <div
      :class="[account.nfts.length > 0 ? '' : 'empty', 'account']"
  >
    <h3>
      {{ account.name }}
      <i id="open"
         v-if="account.nfts.length > 0"
         @click="openNfts()" class="fa-solid fa-chevron-down"></i>
    </h3>
  </div>
</template>

<script>
export default {
  name: 'Account',
  props: {
    account: Object,
  },
  components: {
  },
  methods: {
    openNfts() {
      this.template.getElementById('open').class = 'fa-solid fa-chevron-up'
      this.$emit('open-nfts', this.account.id)
    },
  },
  emits: ['open-nfts'],
}
</script>

<style scope>
h3 {
  color: black;
}

.account {
  background: #f4f4f4;
  margin: 5px;
  padding: 10px 20px;
  cursor: pointer;
}
.account.empty {
  border-left: 5px solid #777777;
}
.account h3 {
  display: flex;
  align-items: center;
  justify-content: space-between;
}
</style>