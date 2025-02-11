//package org.problems.fynd;
//
//public class Maintest {
//
//    public static void main(String[] args) {
//
//        Response res = RestAssured.given().get("/adress");
//       // ObjectMapper objectMapper = new ObjectMapper();
//        HomeListItems list = res.as(HomeListItems.class);
//        list.items.stream().forEach(homeAddressItem -> {
//           if(homeAddressItem.getName()=="Priyanka"){
//           Assert.assertEquals(homeAddressItem.getAddress().getHome(),"test home address");
//           }
//        });
//    }
//}
