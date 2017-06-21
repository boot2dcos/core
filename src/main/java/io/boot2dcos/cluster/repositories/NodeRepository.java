package io.boot2dcos.cluster.repositories;

import io.boot2dcos.cluster.model.Node;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by jauffreyflach on 04/05/2017.
 * boot2dcos-core
 */
public interface NodeRepository extends PagingAndSortingRepository<Node, Long> {

    /**
     * Finds a node by its MAC Address
     *
     * @param macAddress the MAC Address
     * @return a node definition
     */
    Node findByMacAddress(@Param("macAddress") String macAddress);

    /**
     * Counts the number of nodes by role and DC
     * @param role
     * @return
     */
    Integer countByRoleAndDataCenter(@Param("role") String role, @Param("dataCenter") String dataCenter);

    /**
     * Get all nodes by DC
     * @param dataCenter
     * @return
     */
    List<Node> findNodesByDataCenter(@Param("dataCenter") String dataCenter);

    /**
     * Get all nodes by DC and Role
     * @param dataCenter
     * @param role
     * @return
     */
    List<Node> findNodesByDataCenterAndRole(@Param("dataCenter") String dataCenter, @Param("role") String role);
}
