package pl.agh.kis.soa.catering.managers;

import lombok.Getter;
import lombok.Setter;
import pl.agh.kis.soa.catering.api.*;
import pl.agh.kis.soa.catering.model.Dish;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

import static pl.agh.kis.soa.catering.utils.CommonFunctions.redirectToPage;


@Getter
@Setter
@Named("TopDishManager")
@ManagedBean
@SessionScoped
public class TopDishManager implements Serializable {

    @EJB(lookup = "java:global/business-logic-implementation/UserRepository")
    private IUserRepository userRepository;

    @EJB(lookup = "java:global/business-logic-implementation/CategoryRepository")
    private ICategoryRepository categoryRepository;

    @EJB(lookup = "java:global/business-logic-implementation/DishRepository")
    private IDishRepository dishRepository;

    @EJB(lookup = "java:global/business-logic-implementation/OrderRepository")
    private IOrderRepository orderRepository;

    @EJB(lookup = "java:global/business-logic-implementation/SubscriptionRepository")
    private ISubscriptionRepository subscriptionRepository;


    public String setDayDish(Long dishId) {
        dishRepository.setDishDay(dishId);
        return redirectToPage("catering_products");
    }

    public String getDayDish() {
        Dish dish = dishRepository.getDishDay();

        if (dish == null)
            return "Pozycja dnia nie została jeszcze wybrana!";
        else {
            return dish.getName() + " za " + dish.getPrice() + "zł";
        }
    }

}