package br.com.models.request;

import java.util.Date;

import br.com.models.entity.Bedroom;
import br.com.models.entity.Client;
import br.com.models.entity.Payment;

public class AddReserveRequest {

    private long id;
    private Bedroom bedroom;
    private Client client;
    private Date entryDate;
    private Date exitDate;
    private Payment payment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
