<template>
  <div
      :class="[account.nfts.length > 0 ? '' : 'empty', 'account']"
  >
    <h3>
      {{ account.name }}
      <p id="open"
         v-if="account.nfts.length > 0"
         @click="openNfts()">  {{ this.listOpen ? '˄' : '˅'}}</p>
    </h3>

  </div>

  <div id="nft" v-if="this.listOpen">
    {{ account.nfts }}
  </div>

</template>

<script>
export default {
  name: 'Account',
  props: {
    account: Object,
    listOpen: Boolean,
  },
  components: {
  },
  methods: {
    openNfts() {
      this.listOpen = !this.listOpen
      this.$emit('open-list', this.listOpen)
    },
  },
  emits: ['open-list'],
  data() {
    return {
      listOpen: false,
    }
  },


}
</script>

<style scope>
h3 {
  color: black;
}

.account {
  background: #e7e7e7;
  margin: 5px;
  padding: 25px 20px;
  height: 75px;
  cursor: pointer;
  border-left: 5px solid #3f3f3f;
}
.account.empty {
  border-left: 5px solid #b9b9b9;
}
.account h3 {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

#nft {
  background: #e7e7e7;
  padding: 5px 2px;
  cursor: pointer;
  border-left: 5px solid #f1f5f9;
}
</style>