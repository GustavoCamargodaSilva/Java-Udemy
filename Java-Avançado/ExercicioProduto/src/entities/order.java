package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.orderStatus;

public class order {
    private Date moment;
    private orderStatus status;

    private client client;
    private List<orderItem> itens = new ArrayList<>();

    public order() {

    }

    public order(Date moment, orderStatus status, client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public orderStatus getStatus() {
        return status;
    }

    public void setStatus(orderStatus status) {
        this.status = status;
    }

    public client getClient() {
        return client;
    }

    public void setClient(client client) {
        this.client = client;
    }

    public void addItem(orderItem Itens) {
        Itens.add(Itens);
    }

    public void removeItem(orderItem Itens) {
        Itens.remove(Itens);
    }

    public double total() {
        double sum = 0.0;
        for (orderItem item : itens) {
            sum += item.subTotal();
        }
        return sum;
    }
}
