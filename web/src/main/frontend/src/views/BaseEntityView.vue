<template>
  <div>
    <h1>BaseEntity</h1>
    <table>
    <tr>
            <th>id</th>
          </tr>
    <tr v-for="entity in entities">
            <td>id</td>
          </tr>
  </table>
  </div>
</template>

<script>
export default{
  data() {
    return {
      entities: [{      id: 'id',
      }]
    }
  }
}
</script>