<template>
  <div class="conference">
    <img class="picture" :src="pictureUrl">
    <div class="title">title</div>
    <div class="location">location</div>
    <div class="time">time</div>
    <div class="content" v-for="content in contents" :key=content>{{content}}</div>
  </div>
</template>

<script>
export default {
  name: 'Conference',
  props: {
    pictureUrl: {
      type: String,
      default: ''
    },
    forumTitle: {
      type: String,
      default: ''
    },
    forumId: {
      type: Number,
      default: 0
    },
    location: {
      type: String,
      default: ''
    },
    time: {
      type: String,
      default: ''
    },
    contents: {
      type: Array,
      default: () => []
    }
  },
  data: function () {
    return {
    }
  }
}
</script>

<style scoped>
.conference{
  width: 300px;
  height: 500px;
  background-color: white;
  border-radius: 10px;
  box-shadow: 0 5px 20px rgba(25, 25, 25, .75);
}

.picture{
  position: relative;
  border-radius: 10px;
  top: 0;
  width: 100%;
  height: 50%;
}

.title{
  font-size: 15px;
  font-weight: bold;
  margin-top: 10px;
}

.location{
  font-size: 12px;
  margin-top: 10px;
}

.time{
  font-size: 12px;
  margin-top: 10px;
}

</style>
