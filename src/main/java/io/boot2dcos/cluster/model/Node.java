package io.boot2dcos.cluster.model;

import javax.persistence.*;

/**
 * Created by jauffreyflach on 04/05/2017.
 * boot2dcos-core
 */
@Entity
public class Node {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String macAddress;
    private String ip;
    private String dataCenter;
    private String role;
    // ONLINE, OFFLINE, REQUIRED
    private String status;

    public Node() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
