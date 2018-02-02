package br.com.commons.dto;

import java.util.Date;

public class ReserveDTO {


    private long id;
    private BedroomDTO bedroomDTO;
    private ClientDTO clientDTO;
    private Date entryDate;
    private Date exitDate;
    private PaymentDTO paymentDTO;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BedroomDTO getBedroomDTO() {
        return bedroomDTO;
    }

    public void setBedroomDTO(BedroomDTO bedroomDTO) {
        this.bedroomDTO = bedroomDTO;
    }

    public ClientDTO getClientDTO() {
        return clientDTO;
    }

    public void setClientDTO(ClientDTO clientDTO) {
        this.clientDTO = clientDTO;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getExitDate() {
        return exitDate;
    }

    public void setExitDate(Date exitDate) {
        this.exitDate = exitDate;
    }

    public PaymentDTO getPaymentDTO() {
        return paymentDTO;
    }

    public void setPaymentDTO(PaymentDTO paymentDTO) {
        this.paymentDTO = paymentDTO;
    }
}
