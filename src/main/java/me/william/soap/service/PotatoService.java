package me.william.soap.service;

import me.william.soap.beans.Potato;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface PotatoService {
    @WebMethod
    boolean addPotato(Potato p);

    @WebMethod
    boolean deletePotato(int id);

    @WebMethod
    Potato getPotato(int id);

    @WebMethod
    Potato[] getAllPotatoes();
}
