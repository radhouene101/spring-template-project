package test.springtemplateproject.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import test.springtemplateproject.services.IMyServices;

import java.util.List;

@RestController
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
@RequestMapping("test")
public class TheController {
    IMyServices services;

}
