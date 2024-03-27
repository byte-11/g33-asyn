package uz.pdp.g33properitiesandasyn.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.g33properitiesandasyn.service.PaymentService;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping
    public ResponseEntity<String> applyPayment() throws InterruptedException {
        paymentService.apply("AC123213");
        return ResponseEntity.ok("Payment request successfully done. Please confirm secret code");
    }
}
