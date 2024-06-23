package main.java.com.example.demo.controller;

import com.example.demo.model.RequestData;
import com.example.demo.repository.RequestDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/callback")
public class CallbackController {

    @Autowired
    private RequestDataRepository requestDataRepository;

    @PostMapping
    public ResponseEntity<String> handleCallback(@RequestBody RequestData requestData, @AuthenticationPrincipal Object principal) {
        // Optionally use the principal object for further user validation if needed
        requestDataRepository.save(requestData);
        return new ResponseEntity<>("Data saved successfully", HttpStatus.OK);
    }
}
