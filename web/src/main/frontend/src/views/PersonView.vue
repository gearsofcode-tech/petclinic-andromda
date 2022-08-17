<template>
  <div>
    <h1>Person</h1>
    <table>
    <tr>
            <th>firstName</th>
            <th>lastName</th>
            <th>id</th>
          </tr>
    <tr v-for="entity in entities">
            <td>firstName</td>
            <td>lastName</td>
            <td>id</td>
          </tr>
  </table>
  </div>
</template>

<script>
export default{
  data() {
    return {
      entities: [{      firstName: 'firstName',
            lastName: 'lastName',
            id: 'id',
      }]
    }
  }
}
</script>