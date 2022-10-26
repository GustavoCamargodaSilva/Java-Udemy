package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.orderStatus;

public class order {
    private Date moment;
    private orderStatus status;

    private client client;
    private List<orderItem> itens = new ArrayList<orderItem>();

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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

    public void addItem(orderItem itens) {
        itens.add(itens);
    }

    public void removeItem(orderItem itens) {
        itens.remove(itens);
    }

    public double total() {
        double sum = 0.0;
        for (orderItem item : itens) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (orderItem item : itens) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
