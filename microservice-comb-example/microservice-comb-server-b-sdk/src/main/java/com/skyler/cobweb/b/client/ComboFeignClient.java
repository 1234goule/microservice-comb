package com.skyler.cobweb.b.client;

import com.skyler.cobweb.b.dto.ComboDTO;
import com.skyler.cobweb.b.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description:
 * <pre>
 *
 * </pre>
 * NB.
 *
 * @author skyler
 * Created by on 2020-01-08 at 16:50
 */
@FeignClient(contextId = "ComboFeignClient", value = "microservice-comb-server-b")
public interface ComboFeignClient {

    @RequestMapping("/api/combo/getById")
    ComboDTO getById(@RequestParam("id") Long id);

    @PostMapping("/api/combo/create")
    ComboDTO create(@RequestParam("name") String name);

    @GetMapping("/api/combo/getById2")
    ComboDTO getById2(@RequestParam("ucId") Long ucId);

}
