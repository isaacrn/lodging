package lodging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lodging.data.request.AddReserveRequest;
import lodging.persistence.ReserveRepository;
import lodging.service.ReserveService;

@RestController
@RequestMapping("/reserve")
public class ReserveController {

    @Autowired
    private ReserveRepository reserveRepository;

    @Autowired
    public ReserveService reserveService;

    @GetMapping("/all-reserves")
    public ResponseEntity<?> getReserves() {
        return new ResponseEntity<>(reserveRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/add-reserve")
    public ResponseEntity<?> addReserve(@RequestBody AddReserveRequest addReserveRequest) {
        reserveService.createReserve(addReserveRequest);
        return new ResponseEntity(HttpStatus.OK);
    }
}