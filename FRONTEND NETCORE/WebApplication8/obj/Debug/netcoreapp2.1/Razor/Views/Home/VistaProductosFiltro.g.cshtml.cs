#pragma checksum "C:\Users\Nuper\source\repos\WebApplication8\WebApplication8\Views\Home\VistaProductosFiltro.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "73c7214ac644065d98333e13c5136a2aba856864"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Home_VistaProductosFiltro), @"mvc.1.0.view", @"/Views/Home/VistaProductosFiltro.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.Razor.Compilation.RazorViewAttribute(@"/Views/Home/VistaProductosFiltro.cshtml", typeof(AspNetCore.Views_Home_VistaProductosFiltro))]
namespace AspNetCore
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using Microsoft.AspNetCore.Mvc.ViewFeatures;
#line 1 "C:\Users\Nuper\source\repos\WebApplication8\WebApplication8\Views\_ViewImports.cshtml"
using WebApplication8;

#line default
#line hidden
#line 2 "C:\Users\Nuper\source\repos\WebApplication8\WebApplication8\Views\_ViewImports.cshtml"
using WebApplication8.Models;

#line default
#line hidden
#line 7 "C:\Users\Nuper\source\repos\WebApplication8\WebApplication8\Views\Home\VistaProductosFiltro.cshtml"
using X.PagedList.Mvc.Core;

#line default
#line hidden
#line 8 "C:\Users\Nuper\source\repos\WebApplication8\WebApplication8\Views\Home\VistaProductosFiltro.cshtml"
using X.PagedList;

#line default
#line hidden
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"73c7214ac644065d98333e13c5136a2aba856864", @"/Views/Home/VistaProductosFiltro.cshtml")]
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"2e0bd676fd6529541b2fce84f1407bde3b504457", @"/Views/_ViewImports.cshtml")]
    public class Views_Home_VistaProductosFiltro : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<WebApplication8.ModelosVistas.navbarPartialModelCat>
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
#line 2 "C:\Users\Nuper\source\repos\WebApplication8\WebApplication8\Views\Home\VistaProductosFiltro.cshtml"
  
    ViewData["Title"] = "VistaProductosFiltro";

#line default
#line hidden
            BeginContext(116, 4, true);
            WriteLiteral("\r\n\r\n");
            EndContext();
            BeginContext(171, 2, true);
            WriteLiteral("\r\n");
            EndContext();
            BeginContext(174, 41, false);
#line 10 "C:\Users\Nuper\source\repos\WebApplication8\WebApplication8\Views\Home\VistaProductosFiltro.cshtml"
Write(await Html.PartialAsync("_navbarPartial"));

#line default
#line hidden
            EndContext();
            BeginContext(215, 53, true);
            WriteLiteral("\r\n<div id=\"data_cat_wrapper\" class=\"hideYScroll\">\r\n\r\n");
            EndContext();
#line 13 "C:\Users\Nuper\source\repos\WebApplication8\WebApplication8\Views\Home\VistaProductosFiltro.cshtml"
     foreach (var producto in ViewBag.ProductosCat)
    {

#line default
#line hidden
            BeginContext(328, 62, true);
            WriteLiteral("        <div id=\"data_cat\" class=\"miniProducto\">\r\n            ");
            EndContext();
            BeginContext(391, 61, false);
#line 16 "C:\Users\Nuper\source\repos\WebApplication8\WebApplication8\Views\Home\VistaProductosFiltro.cshtml"
       Write(await Html.PartialAsync("_miniProducto", (Productos)producto));

#line default
#line hidden
            EndContext();
            BeginContext(452, 18, true);
            WriteLiteral("\r\n        </div>\r\n");
            EndContext();
#line 18 "C:\Users\Nuper\source\repos\WebApplication8\WebApplication8\Views\Home\VistaProductosFiltro.cshtml"
    }

#line default
#line hidden
            BeginContext(477, 8, true);
            WriteLiteral("</div>\r\n");
            EndContext();
#line 20 "C:\Users\Nuper\source\repos\WebApplication8\WebApplication8\Views\Home\VistaProductosFiltro.cshtml"
  

    var filtro = ViewBag.Filtro;



#line default
#line hidden
            BeginContext(545, 842, false);
#line 29 "C:\Users\Nuper\source\repos\WebApplication8\WebApplication8\Views\Home\VistaProductosFiltro.cshtml"
Write(Html.PagedListPager((IPagedList)ViewBag.ProductosCat, page => Url.Action("VistaProductosFiltro", new { filtro, page }),

    new X.PagedList.Mvc.Common.PagedListRenderOptionsBase
    {
        DisplayLinkToFirstPage = X.PagedList.Mvc.Common.PagedListDisplayMode.Always,
        DisplayLinkToLastPage = X.PagedList.Mvc.Common.PagedListDisplayMode.Always,
        DisplayLinkToPreviousPage = X.PagedList.Mvc.Common.PagedListDisplayMode.Always,
        DisplayLinkToNextPage = X.PagedList.Mvc.Common.PagedListDisplayMode.Always,
        DisplayEllipsesWhenNotShowingAllPageNumbers = true,
        EllipsesFormat = "&#8230",
        LinkToFirstPageFormat = "<<",
        LinkToLastPageFormat = ">>",
        LinkToPreviousPageFormat = "<",
        LinkToNextPageFormat = ">",
        MaximumPageNumbersToDisplay = 6,
    }

    ));

#line default
#line hidden
            EndContext();
#line 46 "C:\Users\Nuper\source\repos\WebApplication8\WebApplication8\Views\Home\VistaProductosFiltro.cshtml"
     ;


#line default
#line hidden
            BeginContext(1395, 2, true);
            WriteLiteral("\r\n");
            EndContext();
            DefineSection("Scripts", async() => {
                BeginContext(1414, 1002, true);
                WriteLiteral(@"
    <script>
        $(window).on('load', function () {
            console.log(""Entro"");
            $(""body:has(div.hideYScroll)"").css('overflow-y', 'hidden');
            console.log(""Salgo"");
        });


    </script>
    <script>

        $(""#myLink"").click(function (e) {
            console.log(""entro"");
            e.preventDefault();
            $.ajax({

                url: $(this).attr(""href""), // comma here instead of semicolon

                success: function () {
                    location.reload();
                }

            });

        });

    </script>
    <script>

        $(""#myLinkDos"").click(function (e) {
            console.log(""entro"");
            e.preventDefault();
            $.ajax({

                url: $(this).attr(""href""), // comma here instead of semicolon

                success: function () {
                    location.reload();
                }

            });

        });

    </script>
");
                EndContext();
            }
            );
        }
        #pragma warning restore 1998
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<WebApplication8.ModelosVistas.navbarPartialModelCat> Html { get; private set; }
    }
}
#pragma warning restore 1591
