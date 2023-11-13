package service;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.List;
@WebService
public class BanqueService {
    @WebMethod (operationName = "c")
    public double conversion(@WebParam(name = "m")double montant)
    {
        return montant*3.3;
    }
    @WebMethod(operationName = "getComptes")

    public List<Compte> getComptes(){
        List<Compte> Comptes = new ArrayList<>();
        Comptes.add(new Compte(1,Math.random()*55555,new Date()));
        Comptes.add(new Compte(2,Math.random()*55555,new Date()));
        Comptes.add(new Compte(3,Math.random()*55555,new Date()));
        return Comptes;
    }
}