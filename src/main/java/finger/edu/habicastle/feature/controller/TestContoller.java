package finger.edu.habicastle.feature.controller;

import finger.edu.habicastle.core.utils.TCorpMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : SH Hong
 * @Date : 2021/06/23
 * @Comment :
 * @TODO :
 */
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/test")
public class TestContoller {

    @GetMapping("")
    public TCorpMap getTestResult() {
        TCorpMap response = new TCorpMap();

        response.put("rsltCd", "00");
        response.put("rsltMsg", "Success");

        return response;
    }
}
