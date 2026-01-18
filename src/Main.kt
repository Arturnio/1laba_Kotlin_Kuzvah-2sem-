import modules.EnergyGenerator
import modules.ResearchLab
import resources.OutpostResource
import resources.ResourceManager

fun main() {
//    val manager = resources.ResourceManager()
//    val minerals = resources.OutpostResource(id = 1, name = "Minerals", amount = 300)
//    val gas = resources.OutpostResource(id = 2, name = "Gas", amount = 100)
//
//    manager.add(minerals)
//    manager.add(gas)
//    manager.printAll()
//    val bonus = minerals.copy(amount = minerals.amount + 50)
//    println("Копия минералов с бонусом $bonus")

    val manager = ResourceManager()
    manager.add(OutpostResource(id = 1, name = "Minerals", amount = 120))
    manager.add(OutpostResource(id = 2, name = "Gas", amount = 40))
    val generator = EnergyGenerator()
    val lab = ResearchLab()
    generator.performAction(manager)
    lab.performAction(manager)
    println()
    manager.printAll()
}