package uz.pdp.g33properitiesandasyn.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class PaymentService {

    private final ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    @Async
    public void apply(String from){
//        Runnable runnable = () -> {
//            validatePaymentProcess();
//        };
//        Thread thread = new Thread(runnable);
//        thread.start();

//        executorService.submit(runnable);
        validatePaymentProcess();
    }

    public void validatePaymentProcess(){
        // Business logic
        System.out.println("["+Thread.currentThread().getName() +  "] Payment is in progress");
        try {
            Thread.sleep(new Random().nextInt(15_000, 20_000));
            throw new RuntimeException();
        } catch (InterruptedException e) {
            throw new RuntimeException("Some error occured");
        }
//        System.out.println("["+Thread.currentThread().getName() +  "] Payment is ready to process");
    }
}
