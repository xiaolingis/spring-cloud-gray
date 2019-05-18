package cn.springcloud.gray.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InstanceInfo {
    private String serviceId;
    private String instanceId;

    private InstanceStatus instanceStatus;
}
