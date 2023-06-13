import firebase from "firebase";

var firebaseConfig = {
  apiKey: "AIzaSyBaALKSk0W_qL41NcVYIdeRaGDEikG7TEg",
  authDomain: "facebook-clone-62c94.firebaseapp.com",
  projectId: "facebook-clone-62c94",
  storageBucket: "facebook-clone-62c94.appspot.com",
  messagingSenderId: "978334355719",
  appId: "1:978334355719:web:b8678d006b8cdf421935a2"
};
  
  // Initialize Firebase
firebase.initializeApp(firebaseConfig);

export {firebase};
