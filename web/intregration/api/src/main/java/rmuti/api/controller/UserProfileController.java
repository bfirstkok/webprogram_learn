package rmuti.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rmuti.api.APIResponse;
import rmuti.api.service.UserProfileRepository;
import rmuti.api.table.UserProfile;

@RestController
@RequestMapping("/user-profile")
@CrossOrigin("http://localhost:3000")
public class UserProfileController {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @PostMapping("/save")
    public APIResponse post(@RequestBody UserProfile userProfile) {
        userProfileRepository.save(userProfile);
        return new APIResponse();
    }
}
