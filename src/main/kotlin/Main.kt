import com.pastdev.jsch.DefaultSessionFactory
import com.pastdev.jsch.command.CommandRunner

fun main(args: Array<String>) {
    val sessionFactory = DefaultSessionFactory("userName", "host_IP", 22)
    sessionFactory.setPassword("password")
    val commandRunner = CommandRunner(sessionFactory)
    val command = "ls -al"
    val commandExecuted = commandRunner.execute(command)

    println(commandExecuted.stdout)
    println(commandExecuted.stderr)
    println(commandExecuted.exitCode)

    commandRunner.close()
}