package edu.uw.danco.broker;

import edu.uw.ext.framework.order.Order;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: dcostinett
 * Date: 5/14/13
 * Time: 7:41 AM
 */
public class OrderComparator implements Comparator<Order> {

    /** Private constructor used to prevent instantiation (Singleton) */
    private OrderComparator() {}

    /** Public instance implementing Singleton desing pattern */
    public static final OrderComparator INSTANCE = new OrderComparator();


    /**
     * Order comparator used to order items in priority queue
     * @param o1 - first order to be compared
     * @param o2 - second order to be compared
     * @return - negative integer if the first order has fewer shares or a lower orderId, 0 if they're the same,
     *           and a positive integer otherwise.
     */
    @Override
    public int compare(Order o1, Order o2) {
        return o1.compareTo(o2);
    }
}
