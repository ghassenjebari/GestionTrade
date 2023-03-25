package service;

import model.Client;
import tools.MaConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ClientService implements InterfaceService<Client>{

    @Override
    public Client add(Client objet) {
        return null;
    }

    Connection cnx;

    public ClientService() {
        cnx = MaConnection.getInstance().getCnx();
    }

    @Override
    public Client get(int id) {
        Client c=new Client();
        try {
            String sql = "select * from user where iduser=?";
            PreparedStatement s = cnx.prepareStatement(sql);
            s.setInt(1,id);
            ResultSet rs = s.executeQuery();
            while (rs.next()) {

                 c = new Client(rs.getInt(1), rs.getString(2));


            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

       return c;
    }

    @Override
    public List<Client> getall() {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean modify(Client objet) {
        return false;
    }
}
