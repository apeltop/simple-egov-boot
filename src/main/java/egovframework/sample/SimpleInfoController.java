package egovframework.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.UUID;

@RestController
public class SimpleInfoController {
    private final UUID uuid = UUID.randomUUID();
    private final String v = "v2";

    @GetMapping("/simple_info.do")
    public String simpleInfo() throws Exception {
        String ip = InetAddress.getLocalHost().getHostAddress();
        return ip + " " + uuid + " " + v;
    }
}
