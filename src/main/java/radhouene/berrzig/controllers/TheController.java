package radhouene.berrzig.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import radhouene.berrzig.services.IMyServices;

@RestController
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
@RequestMapping("test")
public class TheController {
    IMyServices services;

}
