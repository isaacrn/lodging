package br.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.integration.repository.ReserveRepository;
import br.com.models.request.AddReserveRequest;

@RestController(value="reserve")
public class ReserveController {

    private ReserveRepository reserveRepository;

    @Autowired
    public ReserveController(ReserveRepository reserveRepository) {
        this.reserveRepository = reserveRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Reserve> findAllClients() {
        return reserveRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addClient(@RequestBody AddReserveRequest addReserveRequest) {

        Reserve reserve = new Reserve();
        //reserve.getClient();
        //reserveRepository.save(reserve);
    }
}
