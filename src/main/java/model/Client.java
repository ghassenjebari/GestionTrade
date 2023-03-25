package model;

public class Client {


   public Client() {
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNom() {
      return nom;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }



   @Override
   public String toString() {
      return "Client{" +
              "id=" + id +
              ", nom='" + nom + '\'' +
              '}';
   }
   private int  id;

   public Client(int id, String nom) {
      this.id = id;
      this.nom = nom;
   }

   private String nom;

}
