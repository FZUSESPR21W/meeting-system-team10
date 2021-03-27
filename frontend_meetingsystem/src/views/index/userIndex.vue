<template>
  <div id="userIndex">
    <mainFrame></mainFrame>
    <div id="search_div">
      <span id="title">GO Forum</span>
      <span id="total">当前共有38场会议在议程中</span>
      <Input suffix="ios-search"
             id="search_input"
             placeholder="Enter text" />
    </div>

    <Row>
      <Col span="8" id="col1">
        <conference @click="updateSelect"
                    v-for="conference in conferences1"
                    v-bind:key="conference.forumId"
                    :forumId="conference.forumId"
                    :forumTitle="conference.forumTitle"
                    :location="conference.location"
                    :time="conference.time"
                    :content="conference.content"
        ></conference>
      </Col>
      <Col span="8" id="col2">
        <conference @click="updateSelect"
                    v-for="conference in conferences2"
                    v-bind:key="conference.forumId"
                    :forumId="conference.forumId"
                    :forumTitle="conference.forumTitle"
                    :location="conference.location"
                    :time="conference.time"
                    :content="conference.content"
        ></conference>
      </Col>
      <Col span="8" id="col3">
        <conference @click="updateSelect"
                    v-for="conference in conferences3"
                    v-bind:key="conference.forumId"
                    :forumId="conference.forumId"
                    :forumTitle="conference.forumTitle"
                    :location="conference.location"
                    :time="conference.time"
                    :content="conference.content"
        ></conference>
      </Col>
    </Row>
  </div>
</template>

<script>

import mainFrame from '@/components/mainFrame.vue'
import axios from 'axios'
import Conference from '@/components/user/Conference'

export default {
  name: 'userIndex',
  components: { Conference, mainFrame },
  data () {
    return {
      conferences1: [],
      conferences2: [],
      conferences3: []
    }
  },
  methods: {
    fillConferences () {
      axios.get()
        .then(response => {
          for (let i = 0; i < response.data.data.conferences.length; i++) {
            if (i % 3 === 0) {
              this.conferences1.add(response.data.data[i])
            } else if (i % 3 === 1) {
              this.conferences2.add(response.data.data[i])
            } else if (i % 3 === 2) {
              this.conferences3.add(response.data.data[i])
            }
          }
        })
    }
  },
  created () {
    this.fillConferences()
  }
}
</script>

<style scoped lang="less">
#search_div{
  width: 100%;
  height: 400px;
  display: flex;
  flex-direction: column;
  justify-content: flex-start;
  //align-items: center;
  background-image: url("../../assets/search_background.jpg");
  background-size: cover;
  background-position: center center;
  background-repeat: no-repeat;
}

#title{
  font-size: 30px;
  color: white;
  font-weight: bold;
  width: 80%;
  left: 10%;
  position: relative;
  top: 20%;
}

#total{
  font-size: 30px;
  color: white;
  //font-weight: bold;
  width: 80%;
  left: 10%;
  position: relative;
  top: 30%;
}

#search_input{
  width: 80%;
  top: 40%;
  left: 10%;
}

#background {
  position: absolute;
  background-image: url("../../assets/search_background.jpg");
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  background-size: cover;
  background-position: center center;
  background-repeat: no-repeat;
  z-index: -2;
}
</style>
