package one.digitalinnovation.gof.facade;

import subsystem1.crm.CrmService;
import subsystem2.cep.CepApi;

public class Facade {
  public void migrateClient(String name, String cep) {
    String city = CepApi.getInstance().recoverCity(cep);
    String state = CepApi.getInstance().recoverState(cep);

    CrmService.saveClient(name, cep, city, state);
    
  }
}
