
# IoK8sApiCoreV1Probe

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exec** | [**IoK8sApiCoreV1ExecAction**](IoK8sApiCoreV1ExecAction.md) | Exec specifies the action to take. |  [optional]
**failureThreshold** | **Integer** | Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. |  [optional]
**grpc** | [**IoK8sApiCoreV1GRPCAction**](IoK8sApiCoreV1GRPCAction.md) | GRPC specifies an action involving a GRPC port. This is an alpha field and requires enabling GRPCContainerProbe feature gate. |  [optional]
**httpGet** | [**IoK8sApiCoreV1HTTPGetAction**](IoK8sApiCoreV1HTTPGetAction.md) | HTTPGet specifies the http request to perform. |  [optional]
**initialDelaySeconds** | **Integer** | Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes |  [optional]
**periodSeconds** | **Integer** | How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. |  [optional]
**successThreshold** | **Integer** | Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1. |  [optional]
**tcpSocket** | [**IoK8sApiCoreV1TCPSocketAction**](IoK8sApiCoreV1TCPSocketAction.md) | TCPSocket specifies an action involving a TCP port. |  [optional]
**terminationGracePeriodSeconds** | **Integer** | Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod&#39;s terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset. |  [optional]
**timeoutSeconds** | **Integer** | Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes |  [optional]



