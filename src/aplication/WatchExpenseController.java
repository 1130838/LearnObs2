package aplication;

import model.Expense;
import model.LimitWatchDog;
import model.User;
import presentation.MainUI;

/**
 * Created by bruno.devesa on 20-05-2015.
 */
public class WatchExpenseController {
    int number;
    Expense expense;
    User user;
    MainUI mainUI;
    LimitWatchDog limitWatchDog;

    public WatchExpenseController(int number, MainUI mainUI) {
        this.mainUI = mainUI;
        this.number = number;

        // creation
        expense = new Expense(0);
        user = new User();

        expense.addObserver(mainUI);
        expense.addObserver(user); // expense wants be observed by user
        user.subscribe(expense);    // user want to observe expense

        limitWatchDog = new LimitWatchDog();
        checkLimit();

    }

    public void checkLimit() {
        if (limitWatchDog.isViolated(this.number)){
            expense.notifyObservers();
        }
    }


}
