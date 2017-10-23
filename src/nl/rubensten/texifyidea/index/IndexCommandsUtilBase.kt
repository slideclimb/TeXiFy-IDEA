package nl.rubensten.texifyidea.index

import com.intellij.openapi.project.Project
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.stubs.StubIndexKey
import nl.rubensten.texifyidea.psi.LatexCommands
import java.util.regex.Pattern

/**
 * @author Ruben Schellekens
 */
abstract class IndexCommandsUtilBase(
        indexKey: StubIndexKey<String, LatexCommands>
) : IndexUtilBase<LatexCommands>(LatexCommands::class.java, indexKey) {

    companion object {

        private val PRECEDING_SLASH = Pattern.compile("^\\\\")
    }

    /**
     * Get all the commands that have a given name (without slash).
     */
    fun getCommandsByName(name: String, project: Project, scope: GlobalSearchScope): Collection<LatexCommands> {
        val result = ArrayList<LatexCommands>()
        val matchTo = PRECEDING_SLASH.matcher(name).replaceFirst("")

        for (key in getKeys(project)) {
            val commands = getItemsByName(key, project, scope)
            for (cmd in commands) {
                val token = PRECEDING_SLASH.matcher(cmd.name).replaceFirst("")

                if (token == matchTo) {
                    result.add(cmd)
                }
            }
        }

        return result
    }
}